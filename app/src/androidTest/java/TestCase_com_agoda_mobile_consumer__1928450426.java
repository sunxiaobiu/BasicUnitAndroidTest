import android.support.v4.widget.TextViewCompat;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_agoda_mobile_consumer__1928450426 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      byte var1 = 1;
      byte var2 = 1;
      TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds((TextView)var0, var1, 0, var2, 0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
