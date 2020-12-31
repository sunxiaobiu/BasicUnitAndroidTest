import android.text.Html.ImageGetter;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_maildroid_770125559 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ImageGetter.class);
      String var1 = "android";
      ((ImageGetter)var2).getDrawable(var1);
   }
}
