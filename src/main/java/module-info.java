import woorinaru.core.service.ResourceService;
import woorinaru.core.service.ResourceServiceImpl;
import woorinaru.core.service.TermService;
import woorinaru.core.service.TermServiceImpl;
import woorinaru.core.service.UserService;
import woorinaru.core.service.UserServiceImpl;
import woorinaru.core.service.WooriClassService;
import woorinaru.core.service.WooriClassServiceImpl;

module woorinaru.core {
    // Exports Domain Model classes
    exports woorinaru.core.model.base;
    exports woorinaru.core.model.management.administration;
    exports woorinaru.core.model.user;
    // Service implementations
    provides ResourceService with ResourceServiceImpl;
    provides TermService with TermServiceImpl;
    provides UserService with UserServiceImpl;
    provides WooriClassService with WooriClassServiceImpl;
}