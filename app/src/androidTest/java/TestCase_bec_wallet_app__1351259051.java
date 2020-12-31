import android.graphics.drawable.Drawable;
import android.support.v4.widget.TextViewCompat;
import android.widget.EditText;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bec_wallet_app__1351259051 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(EditText.class);
      Object var1 = EasyMock.createMock(Drawable.class);
      TextViewCompat.setCompoundDrawablesRelativeWithIntrinsicBounds((TextView)var0, (Drawable)var1, (Drawable)null, (Drawable)null, (Drawable)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
