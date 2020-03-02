package aquality.appium.mobile.configuration;

/**
 * Describes implementations of configurations to be registered in DI container.
 */
public interface IConfigurationsModule extends aquality.selenium.core.configurations.IConfigurationsModule {

    /**
     * @return class which implements {@link IApplicationProfile}
     */
    default Class<? extends IApplicationProfile> getApplicationProfileImplementation() {
        return ApplicationProfile.class;
    }

    /**
     * @return class which implements {@link IConfiguration}
     */
    default Class<? extends IConfiguration> getConfigurationImplementation() {
        return Configuration.class;
    }

}
