import android.app.Notification.Builder;
import android.content.Context;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_BroWorldAndroid__2095255529 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Builder var1 = new Builder(var2);
      Builder var3 = var1;
      Object var4 = EasyMock.createMock(Bundle.class);
      var3.setExtras((Bundle)var4);
   }
}
