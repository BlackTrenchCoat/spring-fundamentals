// We need a class that is a bean managed by Spring to include another bean in it using @Autowired
package org.theproject.springfundamentals.beanswithannotationsprespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// This @Component annotation plus the <context:component-scan/> in the application context allow Spring to find and
// manage a bean of this class
@Component
public class RunApplication {

    @Autowired
    GotPojo gotPojo;

    public void printMessage() {
        System.out.println(gotPojo.longLiveTheMonarch());
    }
}