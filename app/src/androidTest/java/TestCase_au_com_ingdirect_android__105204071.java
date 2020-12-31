import android.graphics.Typeface;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_ingdirect_android__105204071 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(View.class);
      TextInputLayout var3 = (TextInputLayout)var2;
      Object var1 = EasyMock.createMock(Typeface.class);
      var3.setTypeface((Typeface)var1);
   }
}
