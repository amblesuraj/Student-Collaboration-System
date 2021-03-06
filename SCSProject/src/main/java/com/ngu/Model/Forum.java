/**
 * 
 */
package com.ngu.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author SURAJ
 *@Date Nov 30, 2019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "forum")
public class Forum extends Auditor<String>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String title;
	@Lob
	@Column(columnDefinition = "LONGTEXT")
	private String content;
	
}
