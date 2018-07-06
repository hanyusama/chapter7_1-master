package cn.edu.hqu.javaee.chapter7_1.domain.entity;

import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class Message {
	
	@Getter
	@Setter
	private Long id;
	@Getter
	@Setter
	private String Pmessage;
	@Getter
	@Setter
	private Date postedTime;
	
	@Getter
	@Setter
	private Long hquerId;
	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this,that,"id","time");
	}
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, "id","time");
	}

}
