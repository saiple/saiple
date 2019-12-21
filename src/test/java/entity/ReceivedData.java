package entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ReceivedData {
    Sample sample;
    Credentials validCredentials;
    Credentials InValidCredentials;
}
