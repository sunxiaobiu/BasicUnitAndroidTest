import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59B76F961C678ED90E111FF383FCE11B5FBB677EEDC8E5754F41C1AFB95C8B66_1700465526 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      TextViewCompat.setAutoSizeTextTypeWithDefaults((TextView)var0, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
