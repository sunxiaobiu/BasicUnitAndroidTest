import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_599EE470C87E0152647041BD942DD2BE275F1CE2232E556A7D8F7D90256B4239__1632691430 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Toolbar.class);
      Object var1 = EasyMock.createMock(Drawable.class);
      ((Toolbar)var2).setLogo((Drawable)var1);
   }
}
