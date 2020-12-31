import android.content.Context;
import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59BF9E8479F250B0A6759BDAC1A6952CE67D2B9C6578B040058AB5587D1C19DC_1571619667 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent[].class);
      var2.startActivities((Intent[])var1, (Bundle)null);
   }
}
