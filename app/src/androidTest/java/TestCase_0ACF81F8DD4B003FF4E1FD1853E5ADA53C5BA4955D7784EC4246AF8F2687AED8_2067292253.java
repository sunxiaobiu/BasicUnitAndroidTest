import android.app.Notification;
import android.app.Notification.Builder;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0ACF81F8DD4B003FF4E1FD1853E5ADA53C5BA4955D7784EC4246AF8F2687AED8_2067292253 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(Notification.class);
      Builder.recoverBuilder((Context)var0, (Notification)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
