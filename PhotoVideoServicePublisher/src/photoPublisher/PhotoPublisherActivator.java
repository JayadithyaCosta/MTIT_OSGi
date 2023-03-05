package photoPublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;


public class PhotoPublisherActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Start");
		PhotoServicePublish publisherService = new PhotoServicePublishImpl();
		publishServiceRegistration = context.registerService(
				PhotoServicePublish.class.getName(),publisherService, null); 
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}
}
