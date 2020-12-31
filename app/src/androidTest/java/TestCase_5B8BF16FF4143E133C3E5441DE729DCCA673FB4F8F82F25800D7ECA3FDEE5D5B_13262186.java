import android.os.Bundle;
import android.support.v4.app.NotificationCompat.Builder;
import android.support.v4.app.NotificationCompat.Style;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B8BF16FF4143E133C3E5441DE729DCCA673FB4F8F82F25800D7ECA3FDEE5D5B_13262186 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Builder.class);
      Style var3 = ((Builder)var2).mStyle;
      Object var1 = EasyMock.createMock(Bundle.class);
      var3.addCompatExtras((Bundle)var1);
   }
}
