package com.core.a2driano.mypath.presentation.common.map.item

import android.content.Context
import android.os.Handler
import android.os.Message
import android.util.AttributeSet
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.ProgressBar


class DelayAutoCompleteTextView @JvmOverloads constructor(
        context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : AutoCompleteTextView(context, attrs, defStyleAttr) {

    private var mAutoCompleteDelay = DEFAULT_AUTOCOMPLETE_DELAY
    private var mLoadingIndicator: ProgressBar? = null

    private val mHandler = object : Handler() {
        override fun handleMessage(msg: Message) {
            super@DelayAutoCompleteTextView.performFiltering(msg.obj as CharSequence, msg.arg1)
        }
    }

    fun setLoadingIndicator(progressBar: ProgressBar) {
        mLoadingIndicator = progressBar
    }

    fun setAutoCompleteDelay(autoCompleteDelay: Int) {
        mAutoCompleteDelay = autoCompleteDelay
    }

    override fun performFiltering(text: CharSequence, keyCode: Int) {
        if (mLoadingIndicator != null) {
            mLoadingIndicator!!.visibility = View.VISIBLE
        }
        mHandler.removeMessages(MESSAGE_TEXT_CHANGED)
        mHandler.sendMessageDelayed(mHandler.obtainMessage(MESSAGE_TEXT_CHANGED, text), mAutoCompleteDelay.toLong())
    }

    override fun onFilterComplete(count: Int) {
        if (mLoadingIndicator != null) {
            mLoadingIndicator!!.visibility = View.GONE
        }
        super.onFilterComplete(count)
    }

    companion object {

        private val MESSAGE_TEXT_CHANGED = 100
        private val DEFAULT_AUTOCOMPLETE_DELAY = 750
    }
}