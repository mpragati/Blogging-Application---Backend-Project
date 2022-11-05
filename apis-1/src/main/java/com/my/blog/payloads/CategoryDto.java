package com.my.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
		
		private Integer categoryId;	
		
		@NotBlank
		@Size(min=4,message = "categoryTitle must be min of 4 charaters!")
		private String categoryTitle;
		
		@NotBlank
		@Size(min=10,message = "categoryDescription must be min of 10 charaters!")
		private String categoryDescription;

}
