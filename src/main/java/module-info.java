module woorinaru.core {
    // Exports Domain Model classes
    exports woorinaru.core.model.base;
    exports woorinaru.core.model.management.administration;
    exports woorinaru.core.model.user;
    // Exports SPI and API
    exports woorinaru.core.dao.spi;
    exports woorinaru.core.service;
    // Command
    exports woorinaru.core.command;
    // Exception
    exports woorinaru.core.exception;
}