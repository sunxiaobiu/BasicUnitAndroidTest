import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ListView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_maildroid__1805380090 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ListView.class);
      Drawable var2 = ((ListView)var1).getSelector();
      RippleDrawable var3 = (RippleDrawable)var2;
      var3.jumpToCurrentState();
   }
}
