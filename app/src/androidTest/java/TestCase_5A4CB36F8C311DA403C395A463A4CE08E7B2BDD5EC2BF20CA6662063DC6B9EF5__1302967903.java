import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A4CB36F8C311DA403C395A463A4CE08E7B2BDD5EC2BF20CA6662063DC6B9EF5__1302967903 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(AttributeSet.class);
      Object var3 = EasyMock.createMock(Theme.class);
      VectorDrawableCompat.createFromXmlInner((Resources)var0, (XmlPullParser)var1, (AttributeSet)var2, (Theme)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
