package com.augmentis.ayp.aypquiz;

/**
 * Created by Amita on 7/14/2016.
 */
public class Question {
    private int questionId;
    private boolean answer;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }

    public Question(int questionId, boolean answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public boolean getAnswer() {
        return answer;
    }
}
