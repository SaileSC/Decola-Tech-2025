package br.com.dio.model;



import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class UserModel {
    private int code;
    private String userName;
    private LocalDate birthday;
}
