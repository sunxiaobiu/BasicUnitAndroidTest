import android.support.v4.widget.TextViewCompat;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_vodafone_dreamlabapp_875212179 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      TextViewCompat.setTextAppearance((TextView)var0, 2131427605);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
