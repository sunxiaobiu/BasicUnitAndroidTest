import android.app.ActivityOptions;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bb_fwf_clean__1230948040 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      ActivityOptions var1 = ActivityOptions.makeCustomAnimation((Context)var0, 2130968581, 2130968583);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
