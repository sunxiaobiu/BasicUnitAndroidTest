import android.text.util.Linkify;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_agustin_matriculacion_1947049827 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      Linkify.addLinks((TextView)var0, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
