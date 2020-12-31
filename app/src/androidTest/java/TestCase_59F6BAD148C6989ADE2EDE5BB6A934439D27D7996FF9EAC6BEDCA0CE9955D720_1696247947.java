import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F6BAD148C6989ADE2EDE5BB6A934439D27D7996FF9EAC6BEDCA0CE9955D720_1696247947 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Drawable.class);
      Object var1 = EasyMock.createMock(Resources.class);
      Object var2 = null;
      Object var3 = EasyMock.createMock(AttributeSet.class);
      Object var4 = EasyMock.createMock(Theme.class);
      DrawableCompat.inflate((Drawable)var0, (Resources)var1, (XmlPullParser)var2, (AttributeSet)var3, (Theme)var4);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
