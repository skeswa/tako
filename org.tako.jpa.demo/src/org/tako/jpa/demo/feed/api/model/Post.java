package org.tako.jpa.demo.feed.api.model;

import java.io.Serializable;

import org.tako.jpa.core.model.BaseEntity;


public class Post extends BaseEntity implements Serializable {
	private static final long serialVersionUID = -5135269128249876038L;

	private Long linkId;
	
	private Feed feed;
	
	public Post() {
		super();
	}
	
	public Post(final String name, final String description) {
		this();
		this.name = name;
		this.description = description;
	}

	public Long getLinkId() {
		return linkId;
	}

	public void setLinkId(Long linkId) {
		this.linkId = linkId;
	}

	public Feed getFeed() {
		return feed;
	}

	public void setFeed(Feed feed) {
		this.feed = feed;
	}
}
