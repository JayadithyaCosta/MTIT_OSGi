package weddingdressespublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class WeddingDressesPublisherActivator implements BundleActivator {

	ServiceRegistration WeddingDressesRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Wedding Dresses Publisher!");
		WeddingDressesPublisher  WeddingDressesPublisherService = new WeddingDressesImpl();
		WeddingDressesRegistration = context.registerService(WeddingDressesPublisher.class.getName(), WeddingDressesPublisherService, null);

	}


	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Wedding Dresses Publisher!");
		WeddingDressesRegistration.unregister();


	}

}
