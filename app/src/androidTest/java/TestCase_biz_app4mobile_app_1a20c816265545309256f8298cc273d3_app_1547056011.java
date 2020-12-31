import android.content.ComponentName;
import android.media.AudioManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_biz_app4mobile_app_1a20c816265545309256f8298cc273d3_app_1547056011 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("audio");
      AudioManager var4 = (AudioManager)var3;
      Object var1 = EasyMock.createMock(ComponentName.class);
      var4.unregisterMediaButtonEventReceiver((ComponentName)var1);
   }
}
