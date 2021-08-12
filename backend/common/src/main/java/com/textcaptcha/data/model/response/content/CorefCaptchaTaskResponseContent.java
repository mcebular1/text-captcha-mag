package com.textcaptcha.data.model.response.content;

import java.util.Collections;
import java.util.List;

public class CorefCaptchaTaskResponseContent extends CaptchaTaskResponseContent {

    private List<Integer> tokenIndexes = Collections.emptyList();

    public CorefCaptchaTaskResponseContent(List<Integer> tokenIndexes) {
        this.tokenIndexes = tokenIndexes;
    }

    public CorefCaptchaTaskResponseContent() { }

    public List<Integer> getTokenIndexes() {
        return tokenIndexes;
    }

    public void setTokenIndexes(List<Integer> tokenIndexes) {
        this.tokenIndexes = tokenIndexes;
    }

}
