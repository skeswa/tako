package org.tako.jpa.demo.model.jpa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.tako.jpa.core.model.JPABaseEntity;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Table(name="tako_demo_post")
public class JPAPost extends JPABaseEntity implements Serializable {
	private static final long serialVersionUID = 8538105534304495532L;
	
	@ManyToOne(targetEntity = JPAFeed.class)
	@JoinColumn
	private JPAFeed feed;

	private Long linkId;
	

	public JPAPost() {
		super();
	}

	public JPAPost(String name, String code, Long linkId) {
		this();
		this.name = name;
		this.code = code;
		this.linkId = linkId;
	}

	public JPAFeed getFeed() {
		return feed;
	}

	public void setFeed(JPAFeed feed) {
		this.feed = feed;
	}

	public Long getLinkId() {
		return linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}
}

