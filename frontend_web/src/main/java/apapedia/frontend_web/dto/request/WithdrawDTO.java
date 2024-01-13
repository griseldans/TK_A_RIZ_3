package apapedia.frontend_web.dto.request;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WithdrawDTO {
    private UUID idUser;
    private long balance;
    @JsonProperty("money")
    private long withdrawal;
    private boolean withdrawn;
}
