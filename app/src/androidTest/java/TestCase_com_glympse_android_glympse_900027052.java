import android.content.ComponentName;
import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_glympse_android_glympse_900027052 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Intent.class);
      ComponentName var2 = ((Intent)var1).getComponent();
      int var3 = var2.describeContents();
   }
}
