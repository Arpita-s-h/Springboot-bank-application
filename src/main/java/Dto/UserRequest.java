package Dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	private Long id;
	private String firstName;
	private String lastName;
	private String otherName;
	private String gender;
	private String address;
	private String stateOfOrigin;
	private String email;
	private String phooneNumber;
	private String alternatePhoneNumber;
	private String status;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime modifiedAt;

	
}

