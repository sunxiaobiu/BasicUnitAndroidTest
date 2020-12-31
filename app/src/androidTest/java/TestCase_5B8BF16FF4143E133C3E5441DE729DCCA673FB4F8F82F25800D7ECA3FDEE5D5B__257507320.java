import android.app.Notification;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B8BF16FF4143E133C3E5441DE729DCCA673FB4F8F82F25800D7ECA3FDEE5D5B__257507320 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Notification.class);
      Bundle var1 = NotificationCompat.getExtras((Notification)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
