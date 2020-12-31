import android.graphics.PorterDuffColorFilter;
import androidx.core.util.ObjectsCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_1E678507DF076C790CE1270181C3A2296168FF08F4822ABFF3272E6412D0D36A_1253976101 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(PorterDuffColorFilter.class);
      Object var1 = EasyMock.createMock(PorterDuffColorFilter.class);
      ObjectsCompat.equals(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
