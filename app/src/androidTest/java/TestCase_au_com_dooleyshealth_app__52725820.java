import android.app.Notification.Builder;
import android.graphics.drawable.Icon;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_dooleyshealth_app__52725820 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Builder var2 = new Builder(var1, "BackgroundServices");
      Object var3 = EasyMock.createMock(Icon.class);
      var2.setSmallIcon((Icon)var3);
   }
}
