import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__1194104958 {
   @Test
   public void testCase() throws Exception {
      Paint var2 = new Paint(1);
      Object var1 = EasyMock.createMock(Typeface.class);
      var2.setTypeface((Typeface)var1);
   }
}
