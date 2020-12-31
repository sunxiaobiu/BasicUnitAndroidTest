import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.core.widget.TextViewCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_276714BDA87C450550CF6B087898BADB7822820159305E39E48EC44341978D46_1816680535 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      Object var1 = EasyMock.createMock(Drawable.class);
      TextViewCompat.setCompoundDrawablesRelative((TextView)var0, (Drawable)var1, (Drawable)null, (Drawable)null, (Drawable)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
