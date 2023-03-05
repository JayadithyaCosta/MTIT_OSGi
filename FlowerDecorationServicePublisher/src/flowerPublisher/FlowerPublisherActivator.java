package flowerPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class FlowerPublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start");
		FlowerServicePublish publisherService = new FlowerServicePublishImpl();
		publishServiceRegistration = context.registerService(
				FlowerServicePublish.class.getName(),publisherService, null); 
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}
}
