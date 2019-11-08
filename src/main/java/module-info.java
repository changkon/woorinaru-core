module com.woorinaru.core {
    // Exports Domain Model classes
    exports com.woorinaru.core.model.base;
    exports com.woorinaru.core.model.management.administration;
    exports com.woorinaru.core.model.user;
    // Exports SPI and API
    exports com.woorinaru.core.dao.spi;
    exports com.woorinaru.core.service;
    // Command
    exports com.woorinaru.core.command;
    // Exception
    exports com.woorinaru.core.exception;
}