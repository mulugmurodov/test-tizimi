package uz.srt.srtpaybackend.dto;

import lombok.Data;
import uz.srt.srtpaybackend.enteties.auth.User;
import uz.srt.srtpaybackend.enteties.core.Contest;
import uz.srt.srtpaybackend.enteties.core.District;
import uz.srt.srtpaybackend.enteties.core.Region;

import java.time.LocalDateTime;

@Data
public class ContestDTO {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startDate;
    private Long duration;

    private Boolean deleted = false;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Contest toEntity() {
        Contest contest = new Contest();
        contest.setId(this.id);
        contest.setName(this.name);
        contest.setDescription(this.description);
        contest.setCreatedAt(this.createdAt);
        contest.setUpdatedAt(this.updatedAt);
        contest.setDeleted(this.deleted);
        contest.setStartDate(this.startDate);
        contest.setDuration(this.duration);
        return contest;
    }
}
