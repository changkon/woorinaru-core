module woorinaru.core {
    // Exports Domain Model classes
    exports woorinaru.core.model.base;
    exports woorinaru.core.model.management.administration;
    exports woorinaru.core.model.user;
    // Exports SPI and API
    exports woorinaru.core.dao.spi;
    exports woorinaru.core.service;
    // Exports SPI services
    uses woorinaru.core.dao.spi.EventDao;
    uses woorinaru.core.dao.spi.UserDao;
    uses woorinaru.core.dao.spi.ResourceDao;
    uses woorinaru.core.dao.spi.TermDao;
    uses woorinaru.core.dao.spi.WooriClassDao;

    // Service implementations
//    provides ResourceService with ResourceServiceImpl;
//    provides TermService with TermServiceImpl;
//    provides UserService with UserServiceImpl;
//    provides WooriClassService with WooriClassServiceImpl;
}