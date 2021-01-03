import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5F30229649ADAE5C356FD9E77737F7F5B420AE96CCC57F048EF973623E3B3EE7__1675883212 {
   @Test
   public void testCase() throws Exception {
      MyService var3 = new MyService();
      Object var1 = EasyMock.createMock(Intent.class);
      Object var2 = null;
      var3.sendOrderedBroadcast((Intent)var1, (String)"android", (BroadcastReceiver)var2, (Handler)null, -1, (String)"android", (Bundle)null);
   }
}
