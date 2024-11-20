package com.estramipyme.crud.dto.request;

import com.estramipyme.crud.persistence.entities.Question;
import com.estramipyme.crud.persistence.entities.Response;
import lombok.Data;

@Data
public class CreateResponseDTO {
    private Long id;
    private Question question;
    private String responseText;
    private Long userId;
    private Long resultId;

    public Response toEntity() {
        Response response = new Response();
        response.setQuestion(this.question);
        response.setResponseText(this.responseText);
        // response.setUserId(this.userId);
        response.setResultId(this.resultId);
        return response;
    }
}