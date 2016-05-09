package com.bignerdranch.android.geoquiz;

/**
 * Created by jakefost on 5/9/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public Question(int textRestId, boolean answerTrue) {
        mTextResId = textRestId;
        mAnswerTrue = answerTrue;
    }


}
