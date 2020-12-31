import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import java.text.DateFormat;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59C66D90F3DD3BA62909DE65D8B19E28070D1F55E28CFDC460B5594F2D10E821_1097472408 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      DateFormat var1 = android.text.format.DateFormat.getMediumDateFormat((Context)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
