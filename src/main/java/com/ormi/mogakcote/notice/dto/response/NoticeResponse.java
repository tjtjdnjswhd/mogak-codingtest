package com.ormi.mogakcote.notice.dto.response;

import com.ormi.mogakcote.notice.domain.Notice;

import io.swagger.v3.oas.annotations.info.Info;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
public class NoticeResponse {
    private Long noticeId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
    private Long adminId;

    public static NoticeResponse toResponse(Long noticeId, String title, String content, LocalDateTime createdAt, LocalDateTime modifiedAt, Long adminId) {
        return new NoticeResponse(noticeId, title, content, createdAt, modifiedAt, adminId);
    }


}
