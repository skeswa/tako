package org.tako.jpa.demo.itests;

import static org.amdatu.testing.configurator.TestConfigurator.cleanUp;
import static org.amdatu.testing.configurator.TestConfigurator.configure;
import static org.amdatu.testing.configurator.TestConfigurator.createConfiguration;
import static org.amdatu.testing.configurator.TestConfigurator.createServiceDependency;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.concurrent.TimeUnit;

import org.tako.jpa.core.api.ApplicationException;
import org.tako.jpa.core.api.dao.NoSuchModelException;
import org.tako.jpa.demo.content.api.dao.ICommentDAOService;
import org.tako.jpa.demo.content.api.model.Comment;
import org.tako.jpa.demo.feed.api.dao.IFeedDAOService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class FeedTest {
	private volatile ICommentDAOService commentService;
	private volatile IFeedDAOService feedService;

	
	@Before
	public void setUp() throws Exception {		
		configure(this)
		.add(createServiceDependency().setService(IFeedDAOService.class).setRequired(true))	
		.add(createServiceDependency().setService(ICommentDAOService.class).setRequired(true))	
		.apply();
				
		TimeUnit.SECONDS.sleep(1);
	}
	
	@Test
	public void test() throws ApplicationException, NoSuchModelException {
		Comment comment = commentService.provide(new Comment("MK", "First comment on post"));
		assertNotNull(comment);
	}

	@After
	public void after() {
		cleanUp(this);
	}
    
}
