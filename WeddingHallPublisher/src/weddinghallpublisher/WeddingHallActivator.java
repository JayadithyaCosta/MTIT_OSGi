package weddinghallpublisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class WeddingHallActivator implements BundleActivator {

	ServiceRegistration WeddingHallArrangementRegistration;

	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Start Hall Arrangement Service Publisher!");
		WeddingHall WeddingHallArrangementService = new WeddingHallImpl();
		WeddingHallArrangementRegistration = bundleContext.registerService(WeddingHall.class.getName(), 
				WeddingHallArrangementService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Stop Hall Arrangement Service Publisher!");
		WeddingHallArrangementRegistration.unregister();
	}

}
