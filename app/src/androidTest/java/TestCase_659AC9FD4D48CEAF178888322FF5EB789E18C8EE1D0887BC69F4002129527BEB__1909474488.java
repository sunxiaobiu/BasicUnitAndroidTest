import android.app.Notification.Builder;
import android.content.Context;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_659AC9FD4D48CEAF178888322FF5EB789E18C8EE1D0887BC69F4002129527BEB__1909474488 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1);
      Object var3 = EasyMock.createMock(Bundle.class);
      var2.addExtras((Bundle)var3);
   }
}
