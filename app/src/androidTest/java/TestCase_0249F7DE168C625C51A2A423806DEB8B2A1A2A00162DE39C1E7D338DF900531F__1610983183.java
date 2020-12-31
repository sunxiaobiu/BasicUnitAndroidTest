import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xmlpull.v1.XmlPullParser;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__1610983183 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Resources.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(AttributeSet.class);
      Object var3 = EasyMock.createMock(Theme.class);
      Drawable.createFromXmlInner((Resources)var0, (XmlPullParser)var1, (AttributeSet)var2, (Theme)var3);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
